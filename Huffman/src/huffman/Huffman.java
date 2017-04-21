/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author andro
 */
abstract class HuffmanTree implements Comparable<HuffmanTree> {

    public final int frequency; // the frequency of this tree

    public HuffmanTree(int freq) {
        frequency = freq;
    }

    // compares on the frequency
    @Override
    public int compareTo(HuffmanTree tree) {
        return frequency - tree.frequency;
    }
}

class HuffmanLeaf extends HuffmanTree {

    public final char value; // the character this leaf represents

    public HuffmanLeaf(int freq, char val) {
        super(freq);
        value = val;
    }
}

class HuffmanNode extends HuffmanTree {

    public final HuffmanTree left, right; // subtrees

    public HuffmanNode(HuffmanTree l, HuffmanTree r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }
}

class Huffman {

    public static HuffmanTree buildTree(int[] charFreqs, char[] arr) {
        PriorityQueue<HuffmanTree> trees = new PriorityQueue<>();
        
        for (int i = 0; i < charFreqs.length; i++) {
            if (charFreqs[i] > 0) {
                trees.offer(new HuffmanLeaf(charFreqs[i], arr[i]));
            }
        }

        assert trees.size() > 0;
        
        while (trees.size() > 1) {
            HuffmanTree a = trees.poll();
            HuffmanTree b = trees.poll();

            trees.offer(new HuffmanNode(a, b));
        }
        return trees.poll();
    }

    public static void printCodes(HuffmanTree tree, StringBuffer prefix) {
        assert tree != null;
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf) tree;

            // print out character, frequency, and code for this leaf (which is just the prefix)
            System.out.println(leaf.value + "\t" + leaf.frequency + "\t\t" + prefix);

        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode) tree;

            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length() - 1);

            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String str = "abcdef";
        //converting to array
        char[] arr = str.toCharArray();
        int[] charFreqs = new int[10];
        System.out.println("Enter Frequency of a,b,c,d,e,f ");
        for(int i=0;i<6;i++){
            charFreqs[i] = scanner.nextInt();
        }

        // build tree
        HuffmanTree tree = buildTree(charFreqs, arr);

        System.out.println("SYMBOL\tFREQUENCY\tHUFFMAN CODE");
        printCodes(tree, new StringBuffer());
    }
}
