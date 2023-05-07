package com.github.dejvvit13.day3;

class Node {

    String val;
    Node left;
    Node right;

    Node(final String val) {
        this.val = val;
    }

    Node(final String val, final Node left, final Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
