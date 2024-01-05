class Result {
    private SinglyLinkedListNode head = null;

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode temp;
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        if (position == 1) {
            temp = head;
            head = newnode;
            newnode.next = temp;
        }
        else {
            int tempvar = 1;
            while (true) {
                if (tempvar == position - 1) {
                    break;
                }
                current = current.next;
                tempvar++;
            }
            temp = current.next;
            current.next = newnode;
            newnode.next = temp;
        }
        return head;
    }
}
