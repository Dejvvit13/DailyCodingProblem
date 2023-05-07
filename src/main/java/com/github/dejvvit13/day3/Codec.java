package com.github.dejvvit13.day3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    public String serialize(Node root) {
        if (root == null) {
            return "null,";
        }
        String leftSerialized = serialize(root.left);
        String rightSerialized = serialize(root.right);
        return root.val + "," + leftSerialized + rightSerialized;
    }

    public Node deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializeHelper(queue);
    }

    private Node deserializeHelper(final Queue<String> queue) {
        String valStr = queue.poll();
        if (valStr == null || valStr.equals("null")) {
            return null;
        }
        Node root = new Node(valStr);
        root.left = deserializeHelper(queue);
        root.right = deserializeHelper(queue);
        return root;
    }

}
