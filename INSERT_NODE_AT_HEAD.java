    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode temp = llist;
        llist = newnode;
        newnode.next = temp;
        return llist;
    }
