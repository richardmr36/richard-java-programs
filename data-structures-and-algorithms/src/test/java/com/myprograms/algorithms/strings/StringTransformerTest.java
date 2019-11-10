package com.myprograms.algorithms.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTransformerTest {

    @Test
    public void minNoOfOpsToTransformByRemovingAnyCharAndInsertAtFront() {
        assertEquals(3, StringTransformer.
                minNoOfOpsToTransformByRemovingAnyCharAndInsertAtFront("EACBD", "EABCD"));
    }

    @Test
    public void minNoOfOpsToTransformBinaryStringBySwappingOrReplacing() {
        assertEquals(2, StringTransformer.
                minNoOfOpsToTransformBinaryStringBySwappingOrReplacing("010", "101"));
    }

    @Test
    public void minNoOfOpsToTransformByDeletingOrInserting() {
        StringTransformer.minNoOfOpsToTransformByDeletingOrInserting("heap", "pea");
    }
}