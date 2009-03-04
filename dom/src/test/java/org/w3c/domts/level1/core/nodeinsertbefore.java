
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:


Copyright (c) 2001 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University). All
Rights Reserved. This program is distributed under the W3C's Software
Intellectual Property License. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.
See W3C License http://www.w3.org/Consortium/Legal/ for more details.

*/

package org.w3c.domts.level1.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     The "insertBefore(newChild,refChild)" method inserts the
 *     node "newChild" before the node "refChild". 
 *     
 *     Insert a newly created Element node before the eigth
 *     child of the second employee and check the "newChild"
 *     and "refChild" after insertion for correct placement.
* @author NIST
* @author Mary Brady
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-952280727">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-952280727</a>
*/
public final class nodeinsertbefore extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public nodeinsertbefore(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staff", true);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      NodeList elementList;
      Node employeeNode;
      NodeList childList;
      Node refChild;
      Node newChild;
      Node child;
      String childName;
      int length;
      Node insertedNode;
      java.util.List actual = new java.util.ArrayList();
      
      java.util.List expectedWithWhitespace = new java.util.ArrayList();
      expectedWithWhitespace.add("#text");
      expectedWithWhitespace.add("employeeId");
      expectedWithWhitespace.add("#text");
      expectedWithWhitespace.add("name");
      expectedWithWhitespace.add("#text");
      expectedWithWhitespace.add("position");
      expectedWithWhitespace.add("#text");
      expectedWithWhitespace.add("newChild");
      expectedWithWhitespace.add("salary");
      expectedWithWhitespace.add("#text");
      expectedWithWhitespace.add("gender");
      expectedWithWhitespace.add("#text");
      expectedWithWhitespace.add("address");
      expectedWithWhitespace.add("#text");
      
      java.util.List expectedWithoutWhitespace = new java.util.ArrayList();
      expectedWithoutWhitespace.add("employeeId");
      expectedWithoutWhitespace.add("name");
      expectedWithoutWhitespace.add("position");
      expectedWithoutWhitespace.add("newChild");
      expectedWithoutWhitespace.add("salary");
      expectedWithoutWhitespace.add("gender");
      expectedWithoutWhitespace.add("address");
      
      java.util.List expected = new java.util.ArrayList();
      
      doc = (Document) load("staff", true);
      elementList = doc.getElementsByTagName("employee");
      employeeNode = elementList.item(1);
      childList = employeeNode.getChildNodes();
      length = (int) childList.getLength();
      
      if (equals(6, length)) {
          refChild = childList.item(3);
      expected =  expectedWithoutWhitespace;
      } else {
          refChild = childList.item(7);
      expected =  expectedWithWhitespace;
      }
        
    newChild = doc.createElement("newChild");
      insertedNode = employeeNode.insertBefore(newChild, refChild);
      for (int indexN100DC = 0; indexN100DC < childList.getLength(); indexN100DC++) {
          child = (Node) childList.item(indexN100DC);
    childName = child.getNodeName();
      actual.add(childName);
        }
      assertEquals("nodeNames", expected, actual);
      }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level1/core/nodeinsertbefore";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(nodeinsertbefore.class, args);
   }
}

