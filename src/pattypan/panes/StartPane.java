/*
 * The MIT License
 *
 * Copyright 2016 Pawel Marynowski.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package pattypan.panes;

import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import pattypan.Settings;
import pattypan.Util;
import pattypan.elements.WikiButton;
import pattypan.elements.WikiLabel;

public class StartPane extends GridPane {
  
  String css = getClass().getResource("/pattypan/style/style.css").toExternalForm();
  Stage stage;
  
  public StartPane(Stage stage) {
    this.stage = stage;
    createContent();
  }
  
  public GridPane getContent() {
    return this;
  }

  private GridPane createContent() {
    this.getStylesheets().add(css);
    this.setAlignment(Pos.CENTER);
    this.setHgap(20);
    this.setVgap(10);
    this.getStyleClass().add("background");

    this.getColumnConstraints().add(Util.newColumn(400, "px"));
    
    this.addRow(0, new WikiLabel("pattypan").setClass("title"));
    this.addRow(10, new HBox(20, 
            new WikiButton("Generate Spreadsheet", "primary").setWidth(200).linkTo("ChooseDirectoryPane", stage),
            new WikiButton("Validate & Upload").setWidth(200).linkTo("ValidatePane", stage)));
    
    this.addRow(11, new HBox(20,
            new WikiLabel("Generate Spreadsheet by selecting a directory on your hard drive.").setWidth(200),
            new WikiLabel("Check correctness of your spreadsheet and upload files.").setWidth(200)));
    
    this.addRow(20, new WikiLabel("2016 // Pawel Marynowski \n version "+ Settings.VERSION).setClass("muted"));    
    return this;
  }
}
