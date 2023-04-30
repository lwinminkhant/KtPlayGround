package algorithm.hash

import java.io.UnsupportedEncodingException
import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException


/**
 * @created 08/11/2022 - 9:13 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/8/22
 */

/**
 *
 * MD5 (Message-Digest Algorithm 5)
 * SHA-1 (Secure Hash Algorithm 1)
 * SHA-2 (Secure Hash Algorithm 2)
 * SHA-224
 * SHA-256
 * SHA-384
 * SHA-512
 * SHA-512/224
 * SHA-512/256
 * SHA-3 (Secure Hash Algorithm 3)
 * SHA3-224
 * SHA3-256
 * SHA3-384
 * SHA3-512
 * BLAKE2
 * BLAKE2s
 * BLAKE2b
 * RIPEMD-160 (RACE Integrity Primitives Evaluation Message Digest 160)
 * Whirlpool
 * Tiger
 * Snefru
 * Keccak
 * Each hash algorithm has different characteristics, such as the length of the output, the level of security it provides, and the speed of computation. It's important to choose the appropriate hash algorithm depending on the specific use case and security requirements.*/
class Hasher {

    fun hash(input: String): String {
        val bytes = input.toByteArray()
        val md = MessageDigest.getInstance("MD5")
        val digest = md.digest(bytes)
        return digest.fold("", { str, it -> str + "%02x".format(it) })
    }

    val permutations = HashSet<String>()

    var md: MessageDigest = MessageDigest.getInstance("SHA-256")?:throw NoSuchAlgorithmException("SHA-256")

    fun crackSha256(hash: String, chars: String?): String? {
        permuteChars("", chars!!)
        for (possible in permutations) {
            val tryHash = getSha256(possible)
            if (hash == tryHash) {
                permutations.clear()
                return possible
            }
        }
        permutations.clear()
        return null
    }
    fun permuteChars(prefix: String, chars: String) {
        val length = chars.length
        if (length == 0) {
            permutations.add(prefix)
        }
        for (i in 0 until length) {
            permuteChars(prefix + chars[i], chars.substring(0, i) + chars.substring(i + 1, length))
        }
    }

    private fun getSha256(message: String): String? {
        try {
            val bytes = message.toByteArray(charset("UTF-8"))
            md.update(bytes)
        } catch (e: UnsupportedEncodingException) {
            e.printStackTrace()
        }
        val digest = md.digest()
        return String.format("%064x", BigInteger(1, digest))
    }

}

fun main() {
    print(Hasher().hash("Lwin Min Khant"))
}