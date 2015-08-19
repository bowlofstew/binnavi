/*
Copyright 2014 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({com.google.security.zynamics.binnavi.Gui.CodeBookmarks.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.CriteriaDialog.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Debug.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.GraphWindows.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.MainWindow.AllTests.class,
    com.google.security.zynamics.binnavi.Gui.Users.AllTests.class})
public final class AllTests {
}