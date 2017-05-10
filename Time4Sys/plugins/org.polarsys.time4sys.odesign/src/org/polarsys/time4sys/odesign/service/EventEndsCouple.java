/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.service;

public class EventEndsCouple<Step, EObject> {
    private Step step;
    private EObject reference;

    public EventEndsCouple(Step step, EObject relation) {
        super();
        this.step = step;
        this.reference = relation;
    }

    public int hashCode() {
        int hashFirst = step != null ? step.hashCode() : 0;
        int hashSecond = reference != null ? reference.hashCode() : 0;

        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    public boolean equals(Object other) {
        if (other instanceof EventEndsCouple) {
            EventEndsCouple<Step, EObject> otherPair = (EventEndsCouple) other;
            return 
            ((  this.step == otherPair.step ||
                ( this.step != null && otherPair.step != null &&
                  this.step.equals(otherPair.step))) &&
             (  this.reference == otherPair.reference ||
                ( this.reference != null && otherPair.reference != null &&
                  this.reference.equals(otherPair.reference))) );
        }

        return false;
    }

    public String toString()
    { 
           return "(" + step + ", " + reference + ")"; 
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step first) {
        this.step = first;
    }

    public EObject getRelation() {
        return reference;
    }

    public void setRelation(EObject second) {
        this.reference = second;
    }
}
