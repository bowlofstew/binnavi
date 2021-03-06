/*
Copyright 2015 Google Inc. All Rights Reserved.

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
package com.google.security.zynamics.binnavi.Gui.Debug.EventLists.Actions;

import com.google.security.zynamics.zylib.gui.textfields.TextHelpers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;


/**
 * Action class for filtering trace events by memory content.
 */
public final class CFilterByMemoryAction extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 5049341555996613512L;

  /**
   * The field the filter string is inserted to.
   */
  private final JTextField m_filterField;

  /**
   * Creates a new action object.
   *
   * @param filterField The field the filter string is inserted to.
   */
  public CFilterByMemoryAction(final JTextField filterField) {
    super("Filter by memory content");

    m_filterField = filterField;
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    TextHelpers.insert(m_filterField, "mem==0");
  }
}
