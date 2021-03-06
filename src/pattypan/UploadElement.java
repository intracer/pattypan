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
package pattypan;

import java.io.File;
import java.util.Map;

public class UploadElement {

  private Map<String, String> data;
  private String wikicode;

  public UploadElement() {
  }

  public UploadElement(Map<String, String> data, String wikicode) {
    this.data = data;
    this.wikicode = wikicode;
  }

  public Map<String, String> getData() {
    return data;
  }
  
  public File getFile() {
    return new File(getData("path"));
  }
  
  public String getData(String key) {
    return data.get(key);
  }
  
  public String getWikicode() {
    return wikicode;
  }
  
  public UploadElement setData(Map<String, String> data) {
    this.data = data;
    return this;
  }

  public UploadElement setWikicode(String wikicode) {
    this.wikicode = wikicode;
    return this;
  }

}
