/**
 * Created by IntelliJ IDEA.
 * User: chilang
 * Date: 2003-07-17
 * Time: 03:00:57
 * To change this template use Options | File Templates.
 */
package com.chilang.carrot.filter.cluster.rough.trsm;

import cern.colt.bitvector.BitVector;

public interface RoughSpace {

    /**
     * Calculate lower approximation of specified object
     * @param x
     * @return lower approximation of object
     */
    public Object lowerApproximation(Object x);

    /**
     * Calculate upper approximation of specified object
     * @param x
     * @return upper approximation of object
     */
    public Object upperApproximation(Object x);


    /**
     * Return tolerance class of an object specified by
     * @param id id of object
     * @return BitVector representing tolerance class of specified object
     */
    BitVector getToleranceClass(int id);


    /**
     * Get weighted upper approximation of specified object
     * @param id object's id
     * @return weighted approximation of specified object
     */
    public Object getWeightedUpperApproximation(int id);

    double[][] getUpperWeight();

    BitVector[] getDocumentMatrix();

    BitVector[] getUpperApproximationMatrix();

    ToleranceSpace getToleranceSpace();
}
