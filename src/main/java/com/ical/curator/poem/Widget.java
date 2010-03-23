package com.ical.curator.poem;

import java.util.Enumeration;
import java.util.Vector;

import org.melati.poem.Persistent;
import org.melati.poem.Treeable;

import com.ical.curator.poem.generated.WidgetBase;

/**
 * Melati POEM generated, programmer modifiable stub 
 * for a <code>Persistent</code> <code>Widget</code> object.
 * 
 * <p> 
 * Description: 
 *   A GWT Widget. 
 * </p>
 * 
 * <table> 
 * <tr><th colspan='3'>
 * Field summary for SQL table <code>Widget</code>
 * </th></tr>
 * <tr><th>Name</th><th>Type</th><th>Description</th></tr>
 * <tr><td> id </td><td> Integer </td><td> &nbsp; </td></tr> 
 * <tr><td> owner </td><td> Widget </td><td> The owning widget </td></tr> 
 * <tr><td> name </td><td> String </td><td> The widget name </td></tr> 
 * </table> 
 * 
 * @see org.melati.poem.prepro.TableDef#generatePersistentJava 
 */
public class Widget extends WidgetBase {

 /**
  * Constructor 
  * for a <code>Persistent</code> <code>Widget</code> object.
  * <p>
  * Description: 
  *   A GWT Widget. 
  * </p>
  * 
  * @see org.melati.poem.prepro.TableDef#generatePersistentJava 
  */
  public Widget() { 
    super();
  }


  // programmer's domain-specific code here
  
  @Override
  public Treeable[] getChildren() {
	  Enumeration<Persistent> refs = getDatabase().referencesTo(this);
	  Vector<Persistent> v = new Vector<Persistent>();
	  while (refs.hasMoreElements()) {
	    Persistent p = refs.nextElement();
	    if (p instanceof Widgetwidget) {
	      if (! ((Widgetwidget)p).getChild().equals(this))
          v.addElement(((Widgetwidget)p).getChild());
	    } else
  	    v.addElement(p);
	  }
	  Treeable[] kids;
	  synchronized (v) {
	    kids = new Treeable[v.size()];
	    v.copyInto(kids);
	  }

	  return kids;
  }
  
  @SuppressWarnings("unchecked")
  public Vector<Widget> getChildWidgets() { 
    Widgetwidget criterion = (Widgetwidget)((CuratorDatabase)getDatabase()).getWidgetwidgetTable().newPersistent();
    criterion.setOwner_unsafe(getTroid());
    Vector<Widget> them = new Vector<Widget>();
    Enumeration wws = ((CuratorDatabase)getDatabase()).getWidgetwidgetTable().selection(criterion);
    while (wws.hasMoreElements()) { 
      Widgetwidget ww = (Widgetwidget)wws.nextElement();
      them.add(ww.getChild());
    }
    return them;
  }
  
  @SuppressWarnings("unchecked")
  public Enumeration getEvents() { 
    Event criterion = (Event)((CuratorDatabase)getDatabase()).getEventTable().newPersistent();
    criterion.setWidget_unsafe(getTroid());
    return ((CuratorDatabase)getDatabase()).getEventTable().selection(criterion);
  }
}

