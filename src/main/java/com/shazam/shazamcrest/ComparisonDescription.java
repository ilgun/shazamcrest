/*
 * Copyright 2013 Shazam Entertainment Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
package com.shazam.shazamcrest;

import org.hamcrest.StringDescription;

/**
 * {@link StringDescription} which holds the mismatch message along with the actual and expected Json representation.
 */
public class ComparisonDescription extends StringDescription {
    private String actual;
    private String expected;
    private String differencesMessage;
    private boolean comparisonFailure;

    public String getActual() {
        return actual;
    }

    public String getExpected() {
        return expected;
    }

    public String getDifferencesMessage() {
        return differencesMessage;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public void setDifferencesMessage(String differencesMessage) {
        this.differencesMessage = differencesMessage;
    }

    public void setComparisonFailure(boolean comparisonFailure) {
        this.comparisonFailure = comparisonFailure;
    }

    public boolean isComparisonFailure() {
        return comparisonFailure;
    }
}
