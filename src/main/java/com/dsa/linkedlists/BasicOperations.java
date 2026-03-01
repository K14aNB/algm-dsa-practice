package com.dsa.linkedlists;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.List;
import java.util.stream.IntStream;

public class BasicOperations {
    private static final Logger logger = System.getLogger(BasicOperations.class.getName());

    public static void main(String[] args) {
        // Initialize Empty Singly Linked List
        LinkedList<Integer> emptyLinkedList = new SinglyLinkedList<>();
        logger.log(Level.WARNING, "HEAD data of Empty Singly Linked List: {0}",
                emptyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.WARNING, "TAIL data of Empty Singly Linked List: {0}",
                emptyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.WARNING, "Size of Empty Singly Linked List: {0}", emptyLinkedList.countNodes());
        logger.log(Level.WARNING, "String Representation of Empty Singly Linked List: {0}",
                emptyLinkedList.toString());
        logger.log(Level.WARNING, "Value of isEmpty() for Empty Singly Linked List: {0}",
                emptyLinkedList.isEmpty());

        // Basic Insertion
        LinkedList<String> basicInsertionLinkedList = new SinglyLinkedList<>();
        basicInsertionLinkedList.prepend("A");
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                basicInsertionLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}",
                basicInsertionLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                basicInsertionLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}",
                basicInsertionLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", basicInsertionLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                basicInsertionLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                basicInsertionLinkedList.isEmpty());

        basicInsertionLinkedList.prepend("B");
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                basicInsertionLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}",
                basicInsertionLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                basicInsertionLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}",
                basicInsertionLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", basicInsertionLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                basicInsertionLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                basicInsertionLinkedList.isEmpty());

        basicInsertionLinkedList.append("C");
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                basicInsertionLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}",
                basicInsertionLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                basicInsertionLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}",
                basicInsertionLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", basicInsertionLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                basicInsertionLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                basicInsertionLinkedList.isEmpty());

        // Single Element Lifecycle
        LinkedList<Integer> singleElementLifeCycleLinkedList = new SinglyLinkedList<>();
        singleElementLifeCycleLinkedList.append(100);
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.isEmpty());

        int singleElementLifecycleRemovedData = singleElementLifeCycleLinkedList.remove(100).orElse(null);
        logger.log(Level.INFO, "Removed Data from Singly Linked List: {0}", singleElementLifecycleRemovedData);
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                singleElementLifeCycleLinkedList.isEmpty());

        // Insertion in the middle
        LinkedList<Integer> insertionInTheMiddleLinkedList = new SinglyLinkedList<>(List.of(1, 3));
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", insertionInTheMiddleLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                insertionInTheMiddleLinkedList.isEmpty());

        insertionInTheMiddleLinkedList.insert(1, 2);
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", insertionInTheMiddleLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                insertionInTheMiddleLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                insertionInTheMiddleLinkedList.isEmpty());

        // Removal Logic
        LinkedList<Integer> removalLogicLinkedList = new SinglyLinkedList<>(List.of(10, 20, 30, 40, 50));
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                removalLogicLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", removalLogicLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                removalLogicLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", removalLogicLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", removalLogicLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                removalLogicLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                removalLogicLinkedList.isEmpty());

        int removalLogicRemovedDatafromHead = removalLogicLinkedList.removeAt(0).orElse(null);
        logger.log(Level.INFO, "Removed Data from Singly Linked List: {0}", removalLogicRemovedDatafromHead);
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                removalLogicLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", removalLogicLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                removalLogicLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", removalLogicLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", removalLogicLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                removalLogicLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                removalLogicLinkedList.isEmpty());

        int removalLogicRemovedDataFromTail = removalLogicLinkedList
                .removeAt(removalLogicLinkedList.countNodes() - 1).orElse(null);
        logger.log(Level.INFO, "Removed Data from Singly Linked List: {0}", removalLogicRemovedDataFromTail);
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                removalLogicLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", removalLogicLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                removalLogicLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", removalLogicLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", removalLogicLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                removalLogicLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                removalLogicLinkedList.isEmpty());

        int removalLogicRemovedDataFromMiddle = removalLogicLinkedList.removeAt(1).orElse(null);
        logger.log(Level.INFO, "Removed Data from Singly Linked List: {0}", removalLogicRemovedDataFromMiddle);
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                removalLogicLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", removalLogicLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                removalLogicLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", removalLogicLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", removalLogicLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                removalLogicLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                removalLogicLinkedList.isEmpty());

        // Value Based Operations
        LinkedList<String> valueBasedOpsLinkedList = new SinglyLinkedList<>(
                List.of("Apple", "Banana", "Apple", "Cherry"));
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                valueBasedOpsLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", valueBasedOpsLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                valueBasedOpsLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", valueBasedOpsLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", valueBasedOpsLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                valueBasedOpsLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                valueBasedOpsLinkedList.isEmpty());

        int bananaIndex = valueBasedOpsLinkedList.indexOf("Banana");
        logger.log(Level.INFO, "Index of Banana in Singly Linked List: {0}", bananaIndex);

        int appleIndex = valueBasedOpsLinkedList.indexOf("Apple");
        logger.log(Level.INFO, "Index of Apple in Singly Linked List: {0}", appleIndex);

        int appleLastIndex = valueBasedOpsLinkedList.lastIndexOf("Apple");
        logger.log(Level.INFO, "Last Index of Apple in Singly Linked List: {0}", appleLastIndex);

        String valueBasedOpsRemovedData = valueBasedOpsLinkedList.remove("Apple").orElse(null);
        logger.log(Level.INFO, "Removed Data from Singly Linked List: {0}", valueBasedOpsRemovedData);
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                valueBasedOpsLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", valueBasedOpsLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                valueBasedOpsLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", valueBasedOpsLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", valueBasedOpsLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                valueBasedOpsLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                valueBasedOpsLinkedList.isEmpty());

        boolean valueBasedOpsContainsZinc = valueBasedOpsLinkedList.contains("Zinc");
        logger.log(Level.INFO, "Check if Singly Linked List contains Zinc: {0}", valueBasedOpsContainsZinc);

        // Stress Test
        // LinkedList<Integer> stressTestLinkedList = new SinglyLinkedList<>(
        // IntStream.rangeClosed(0, 10000).boxed().toList());
        // logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
        // stressTestLinkedList.getHeadNode().map(Node::getData).orElse(null));
        // logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}",
        // stressTestLinkedList
        // .getHeadNode().map(Node::getNextNode).map(Node::getData).orElse(null));
        // logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
        // stressTestLinkedList.getTailNode().map(Node::getData).orElse(null));
        // logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}",
        // stressTestLinkedList
        // .getTailNode().map(Node::getNextNode).map(Node::getData).orElse(null));
        // logger.log(Level.INFO, "Size of Singly Linked List: {0}",
        // stressTestLinkedList.countNodes());
        // logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
        // stressTestLinkedList.toString());
        // logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
        // stressTestLinkedList.isEmpty());

        // Null Data Handling
        LinkedList<String> nullDataHandlingLinkedList = new SinglyLinkedList<>();
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", nullDataHandlingLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                nullDataHandlingLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                nullDataHandlingLinkedList.isEmpty());

        nullDataHandlingLinkedList.prepend("A");
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", nullDataHandlingLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                nullDataHandlingLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                nullDataHandlingLinkedList.isEmpty());

        nullDataHandlingLinkedList.append(null);
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", nullDataHandlingLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                nullDataHandlingLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                nullDataHandlingLinkedList.isEmpty());

        nullDataHandlingLinkedList.append("B");
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", nullDataHandlingLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                nullDataHandlingLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                nullDataHandlingLinkedList.isEmpty());

        String nullDataHandlingRemovedData = nullDataHandlingLinkedList.remove(null).orElse(null);
        logger.log(Level.INFO, "Removed Data from Singly Linked List: {0}", nullDataHandlingRemovedData);
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                nullDataHandlingLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", nullDataHandlingLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", nullDataHandlingLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                nullDataHandlingLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                nullDataHandlingLinkedList.isEmpty());

        // Reverse Singly Linked List
        LinkedList<Integer> reversalLinkedList = new SinglyLinkedList<>(List.of(1, 2, 3, 4, 5));
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                reversalLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", reversalLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                reversalLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", reversalLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", reversalLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                reversalLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                reversalLinkedList.isEmpty());
        reversalLinkedList.reverse();
        logger.log(Level.INFO, "HEAD data of Singly Linked List: {0}",
                reversalLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Singly Linked List: {0}", reversalLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Singly Linked List: {0}",
                reversalLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Singly Linked List: {0}", reversalLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Singly Linked List: {0}", reversalLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Singly Linked List: {0}",
                reversalLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Singly Linked List: {0}",
                reversalLinkedList.isEmpty());

        // Initialize Empty Doubly Linked List
        LinkedList<Integer> emptyDoublyLinkedList = new DoublyLinkedList<>();
        logger.log(Level.WARNING, "HEAD data of Empty Doubly Linked List: {0}",
                emptyDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.WARNING, "TAIL data of Empty Doubly Linked List: {0}",
                emptyDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.WARNING, "Size of Empty Doubly Linked List: {0}", emptyDoublyLinkedList.countNodes());
        logger.log(Level.WARNING, "String Representation of Empty Doubly Linked List: {0}",
                emptyDoublyLinkedList.toString());
        logger.log(Level.WARNING, "Value of isEmpty() for Empty Doubly Linked List: {0}",
                emptyDoublyLinkedList.isEmpty());

        // Basic Insertion
        LinkedList<String> basicInsertionDoublyLinkedList = new DoublyLinkedList<>();
        basicInsertionDoublyLinkedList.prepend("A");
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", basicInsertionDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.isEmpty());

        basicInsertionDoublyLinkedList.prepend("B");
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", basicInsertionDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.isEmpty());

        basicInsertionDoublyLinkedList.append("C");
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", basicInsertionDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                basicInsertionDoublyLinkedList.isEmpty());

        // Single Element Lifecycle
        LinkedList<Integer> singleElementLifeCycleDoublyLinkedList = new DoublyLinkedList<>();
        singleElementLifeCycleDoublyLinkedList.append(100);
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.isEmpty());

        int singleElementLifecycleDoublyLinkedListRemovedData = singleElementLifeCycleDoublyLinkedList
                .remove(100).orElse(null);
        logger.log(Level.INFO, "Removed Data from Doubly Linked List: {0}",
                singleElementLifecycleDoublyLinkedListRemovedData);
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.getHeadNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.getTailNode().map(Node::getNextNode)
                        .map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                singleElementLifeCycleDoublyLinkedList.isEmpty());

        // Insertion in the middle
        LinkedList<Integer> insertionInTheMiddleDoublyLinkedList = new DoublyLinkedList<>(List.of(1, 3));
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.isEmpty());

        insertionInTheMiddleDoublyLinkedList.insert(1, 2);
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                insertionInTheMiddleDoublyLinkedList.isEmpty());

        // Removal Logic
        LinkedList<Integer> removalLogicDoublyLinkedList = new DoublyLinkedList<>(List.of(10, 20, 30, 40, 50));
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}", removalLogicDoublyLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}", removalLogicDoublyLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", removalLogicDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.isEmpty());

        int removalLogicRemovedDatafromHeadDoublyLinkedList = removalLogicDoublyLinkedList.removeAt(0)
                .orElse(null);
        logger.log(Level.INFO, "Removed Data from Doubly Linked List: {0}",
                removalLogicRemovedDatafromHeadDoublyLinkedList);
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}", removalLogicDoublyLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}", removalLogicDoublyLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", removalLogicDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.isEmpty());

        int removalLogicRemovedDataFromTailDoublyLinkedList = removalLogicDoublyLinkedList
                .removeAt(removalLogicDoublyLinkedList.countNodes() - 1).orElse(null);
        logger.log(Level.INFO, "Removed Data from Doubly Linked List: {0}",
                removalLogicRemovedDataFromTailDoublyLinkedList);
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}", removalLogicDoublyLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}", removalLogicDoublyLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", removalLogicDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.isEmpty());

        int removalLogicRemovedDataFromMiddleDoublyLinkedList = removalLogicDoublyLinkedList.removeAt(1)
                .orElse(null);
        logger.log(Level.INFO, "Removed Data from Doubly Linked List: {0}",
                removalLogicRemovedDataFromMiddleDoublyLinkedList);
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}", removalLogicDoublyLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}", removalLogicDoublyLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", removalLogicDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                removalLogicDoublyLinkedList.isEmpty());

        // Value Based Operations
        LinkedList<String> valueBasedOpsDoublyLinkedList = new DoublyLinkedList<>(
                List.of("Apple", "Banana", "Apple", "Cherry"));
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", valueBasedOpsDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList.isEmpty());

        int bananaIndexDoublyLinkedList = valueBasedOpsDoublyLinkedList.indexOf("Banana");
        logger.log(Level.INFO, "Index of Banana in Doubly Linked List: {0}", bananaIndexDoublyLinkedList);

        int appleIndexDoublyLinkedList = valueBasedOpsDoublyLinkedList.indexOf("Apple");
        logger.log(Level.INFO, "Index of Apple in Doubly Linked List: {0}", appleIndexDoublyLinkedList);

        int appleLastIndexDoublyLinkedList = valueBasedOpsDoublyLinkedList.lastIndexOf("Apple");
        logger.log(Level.INFO, "Last Index of Apple in Doubly Linked List: {0}",
                appleLastIndexDoublyLinkedList);

        String valueBasedOpsRemovedDataDoublyLinkedList = valueBasedOpsDoublyLinkedList.remove("Apple")
                .orElse(null);
        logger.log(Level.INFO, "Removed Data from Doubly Linked List: {0}",
                valueBasedOpsRemovedDataDoublyLinkedList);
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", valueBasedOpsDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                valueBasedOpsDoublyLinkedList.isEmpty());

        boolean valueBasedOpsContainsZincDoublyLinkedList = valueBasedOpsDoublyLinkedList.contains("Zinc");
        logger.log(Level.INFO, "Check if Doubly Linked List contains Zinc: {0}",
                valueBasedOpsContainsZincDoublyLinkedList);

        // Stress Test
        // LinkedList<Integer> stressTestDoublyLinkedList = new DoublyLinkedList<>(
        // IntStream.rangeClosed(0, 10000).boxed().toList());
        // logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
        // stressTestDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        // logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
        // stressTestDoublyLinkedList
        // .getHeadNode().map(Node::getNextNode).map(Node::getData).orElse(null));
        // logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
        // stressTestDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        // logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
        // stressTestDoublyLinkedList
        // .getTailNode().map(Node::getNextNode).map(Node::getData).orElse(null));
        // logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
        // stressTestDoublyLinkedList.countNodes());
        // logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
        // stressTestDoublyLinkedList.toString());
        // logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
        // stressTestDoublyLinkedList.isEmpty());

        // Null Data Handling
        LinkedList<String> nullDataHandlingDoublyLinkedList = new DoublyLinkedList<>();
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                nullDataHandlingLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.isEmpty());

        nullDataHandlingDoublyLinkedList.prepend("A");
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.isEmpty());

        nullDataHandlingDoublyLinkedList.append(null);
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.isEmpty());

        nullDataHandlingDoublyLinkedList.append("B");
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.isEmpty());

        String nullDataHandlingRemovedDataDoublyLinkedList = nullDataHandlingDoublyLinkedList.remove(null)
                .orElse(null);
        logger.log(Level.INFO, "Removed Data from Doubly Linked List: {0}",
                nullDataHandlingRemovedDataDoublyLinkedList);
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.getHeadNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getHeadNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.getTailNode().map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList
                        .getTailNode().map(Node::getNextNode).map(Node::getData)
                        .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                nullDataHandlingDoublyLinkedList.isEmpty());

        // Reverse Doubly Linked List
        LinkedList<Integer> reversalDoublyLinkedList = new DoublyLinkedList<>(List.of(1, 2, 3, 4, 5));
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                reversalDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}", reversalDoublyLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                reversalDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}", reversalDoublyLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", reversalDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                reversalDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                reversalDoublyLinkedList.isEmpty());
        reversalDoublyLinkedList.reverse();
        logger.log(Level.INFO, "HEAD data of Doubly Linked List: {0}",
                reversalDoublyLinkedList.getHeadNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "HEAD Next pointer data of Doubly Linked List: {0}", reversalDoublyLinkedList
                .getHeadNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "TAIL data of Doubly Linked List: {0}",
                reversalDoublyLinkedList.getTailNode().map(Node::getData).orElse(null));
        logger.log(Level.INFO, "TAIL Next pointer data of Doubly Linked List: {0}", reversalDoublyLinkedList
                .getTailNode().map(Node::getNextNode).map(Node::getData)
                .orElse(null));
        logger.log(Level.INFO, "Size of Doubly Linked List: {0}", reversalDoublyLinkedList.countNodes());
        logger.log(Level.INFO, "String representation of Doubly Linked List: {0}",
                reversalDoublyLinkedList.toString());
        logger.log(Level.INFO, "Value of isEmpty() for Doubly Linked List: {0}",
                reversalDoublyLinkedList.isEmpty());

    }
}
