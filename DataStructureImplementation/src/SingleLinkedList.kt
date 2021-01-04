class SingleLinkedList<T> {

    // head of linked list.
    private var head: Node<T>? = null

    data class Node<T> constructor(
        var value: T,
        var next: Node<T>? = null
    )

    /**
     * ===== > Insertion in linked list.
     * In this post, methods to insert a new node in linked list are discussed. A node can be added in three ways
     * 1) At the front of the linked list. [push]
     * 2) After a given node. [insertAfter]
     * 3) At the end of the linked list. [append]
     */

    // 1. insert node at beginning of list
    fun push(value: T) {
        head = Node(value, head)
    }

    // 2. insert node after a given node ref.
    fun insertAfter(node: Node<T>, value: T) {

        // creating new node and assigning it's next to given node's next.
        val newNode = Node(value, node.next)

        // and assigning new node to given node's next.
        node.next = newNode

    }

    // 3. insert node at the end of linked list
    fun append(value: T) {
        when (head) {

            // if null
            null -> {
                // create new node and assign to head.
                push(value)
            }

            // if not null
            else -> {

                // get current head and iterate while last node of element
                var currentHead = head
                while (currentHead?.next != null) {
                    currentHead = currentHead.next
                }

                // adding node to end of linked this
                currentHead?.next = Node(value)
            }
        }
    }

    /**
     * ===== > Searching in linked list.
     * In this post, methods to search a node in linked list are discussed. A node can be searched in two ways.
     * By Iterative method [searchByIterative].
     * By Recursive method [searchByRecursive].
     */

    // search node iterative method.
    fun searchByIterative(value: T): Node<T>? {
        // get current head and iterate while last node of element
        var currentHead = head

        while (currentHead != null) {

            // if we found matching value we will return it's node
            if (currentHead.value == value) {
                return currentHead
            }

            // pointing to next node
            currentHead = currentHead.next
        }

        return null
    }

    // search node recursive method.
    fun searchByRecursive(value: T, head: Node<T>? = this.head): Node<T>? {

        // Recursion base case
        if (head == null) {
            return null
        }

        // check if its matches it's value then return node
        if (head.value == value) {
            return head
        }

        return searchByRecursive(value, head.next)
    }

    /**
     * ===== > Deletion in linked list.
     * In this post, methods to delete a node in linked list are discussed. A node can be deleted in two ways
     * 1) By given key. [deleteByKey]
     * 2) By given position. [deleteByPosition]
     */

    // delete by value
    fun deleteByKey(value: T) {

        var currentHead = head
        var previousNode: Node<T>? = null

        // if list is empty
        if (currentHead == null) {
            return
        }

        // if current head itself contains the value.
        if (currentHead.value == value) {
            head = head?.next // head changed.
            return
        }

        while (currentHead != null && currentHead.value != value) {
            previousNode = currentHead
            currentHead = currentHead.next
        }

        // key is not available in linked list.
        if (currentHead == null) {
            return
        }

        previousNode?.next = currentHead.next
    }

    // deleteByPosition
    fun deleteByPosition(position: Int) {

        // if list is empty
        if (head == null)
            return

        // if given position is 0
        if (position == 0) {
            head = head?.next
            return
        }

        var currentHead = head

        // find previous node of the node to be deleted.
        for (i in 0 until position-1) {
            currentHead = currentHead?.next
        }

        // If position is more than number of nodes
        if (currentHead?.next == null)
            return

        // updating heads
        currentHead.next = currentHead.next?.next

    }


    // print linked list
    fun printLinkedList() {
        var currentHead = head
        while (currentHead != null) {
            print(currentHead.value.toString())
            currentHead = currentHead.next
            if (currentHead != null) {
                print(",")
            }
        }
    }
}

fun main() {
    // creating LinkedList of String.
    val linkedList = SingleLinkedList<String>()

    // inserting
    println("======= Inserting start =======")
    linkedList.append("1st")
    linkedList.append("2nd")
    linkedList.append("3rd")
    linkedList.append("4th")
    linkedList.append("5th")
    linkedList.append("6th")
    linkedList.append("7th")
    linkedList.push("2")
    linkedList.push("1")

    // adding after node
    linkedList.searchByIterative("2")?.let {
        linkedList.insertAfter(it,"3")
    }

    println(linkedList.printLinkedList())
    println("======= Inserting done ======= \n")


    // searching
    println("======= Searching start =======")
    println(linkedList.searchByIterative("6th"))
    println(linkedList.searchByRecursive("7th"))
    println(linkedList.searchByRecursive("9th"))
    println("======= Searching stop ======= \n")

    // deleting
    println("======= Deleting start =======")

    linkedList.deleteByKey("5th")
    println(linkedList.printLinkedList())

    linkedList.deleteByPosition(0)
    println(linkedList.printLinkedList())

    println("======= Deleting done ======= \n")


}