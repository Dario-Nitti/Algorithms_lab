package Esame_22_2_22;

import java.util.Iterator;

public class binary {
    public static <E> int countInternalNodes(BinaryNode<E> root){
        if(root!=null){
            int internalNodes=countInternalNodes(root.getRight()) + countInternalNodes(root.getLeft());
            if(root.getLeft() !=null || root.getRight() !=null){
                return internalNodes+=1;
            }else {
                return internalNodes;
            }
        }else {
            return 0;
        }
    }
}


