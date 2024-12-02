package io.crevolika.ch10

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

inline fun <T> synchronized(lock: Lock, action: () -> T): T
{
    lock.lock()
    try {
        return action()
    }
    finally {
        lock.unlock()
    }
}

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body)
    }
}

class LockOwner2(val lock: Lock) {
    fun __runUnderLock__(body: () -> Unit) {
        lock.lock()
        try {
            body()
        }
        finally {
            lock.unlock()
        }
    }
}

class FunctionStorage {
    var myStoredFunction: ((Int) -> Unit)? = null
    inline fun storeFunction(f: (Int) -> Unit) {
       // myStoredFunction = f
    }}


fun main() {
    val l = ReentrantLock()
    synchronized(l) {
// ...
        ReentrantLock(false)
    }

    println(StringBuilder().apply sb@ {
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })

}