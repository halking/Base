package com.hal.tree;

import com.hal.common.Iterator;

/**
 * @author hal
 */
public interface BinTree {
     public BinTreePosition getRoot();
     public boolean isEmpty();
     public  int size();
     public int getHeight();
     public int getDepth();
     public  Iterator  elementPreorder();
     public  Iterator  elementIntorder();
     public  Iterator  elementPostorder();
     public  Iterator  elementLevelorder();
}
