package com.github.dejvvit13.day3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Day3Problem {


    public static void main(String[] args) {
        Node root = new Node("root", new Node("left", new Node("left.left"), null), new Node("right"));

        Codec codec = new Codec();
        String serialized = codec.serialize(root);
        System.out.println(serialized);

        Node deserialized = codec.deserialize(serialized);
        System.out.println(deserialized.left.left.val);


    }


}
