package com.mmnaseri.cs.clrs.ch29.s1;

/**
 * @author Milad Naseri (milad.naseri@cdk.com)
 * @since 1.0 (8/30/16, 3:02 PM)
 */
public interface LinearFunction<E extends Number> {

    int size();

    E getCoefficient(int index);

    @SuppressWarnings("unchecked")
    E evaluate(E... values);

}
