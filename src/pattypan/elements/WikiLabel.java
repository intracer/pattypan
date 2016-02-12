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
package pattypan.elements;

import com.sun.javafx.tk.FontLoader;
import com.sun.javafx.tk.Toolkit;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

public class WikiLabel extends Label {
  
  public WikiLabel(String text) {
    super(text);
    this.getStyleClass().addAll("mw-ui-text");
    this.wrapTextProperty().setValue(true);
    this.setTextAlignment(TextAlignment.CENTER);
    this.setMaxWidth(200);
  }
  
  public WikiLabel setAlign(String position) {
    if(position.equals("left")) {
      this.setAlignment(Pos.CENTER_LEFT);
      this.setTextAlignment(TextAlignment.LEFT);
    }
    else if(position.equals("right")) {
      this.setAlignment(Pos.CENTER_RIGHT);
      this.setTextAlignment(TextAlignment.RIGHT);
    }
    else if(position.equals("center")) {
      this.setAlignment(Pos.CENTER);
      this.setTextAlignment(TextAlignment.CENTER);
    }
    return this;
  }
  
  public WikiLabel setClass(String cssClass) {
    this.getStyleClass().add(cssClass);
    return this;
  }
  
  public WikiLabel setTranslateByHalf(boolean right) {
    FontLoader fontLoader = Toolkit.getToolkit().getFontLoader();
    double textWidth = fontLoader.computeStringWidth(this.getText(), this.getFont());
    this.setTranslateX(textWidth * 0.5 * (right ? 1 : -1));
    return this;
  }
}