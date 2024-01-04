    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;
        if (head == null) {
            head = newnode;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
        return head;
    }

