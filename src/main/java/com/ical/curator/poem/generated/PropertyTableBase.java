// Do not edit this file!  It was generated by Melati POEM's DSD preprocessor.

package com.ical.curator.poem.generated;


import com.ical.curator.poem.CuratorDatabaseTables;
import com.ical.curator.poem.CuratorTable;
import com.ical.curator.poem.Property;
import com.ical.curator.poem.Widget;
import org.melati.poem.AccessPoemException;
import org.melati.poem.Column;
import org.melati.poem.Database;
import org.melati.poem.DefinitionSource;
import org.melati.poem.DisplayLevel;
import org.melati.poem.Field;
import org.melati.poem.JdbcPersistent;
import org.melati.poem.Persistent;
import org.melati.poem.PoemException;
import org.melati.poem.ReferencePoemType;
import org.melati.poem.Searchability;
import org.melati.poem.StringPoemType;
import org.melati.poem.TroidPoemType;
import org.melati.poem.ValidationPoemException;


/**
 * Melati POEM generated base class for 
<code>Table</code> <code>Property</code>.
 *
 * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
 */

public class PropertyTableBase extends CuratorTable {

  private Column<Integer> col_id = null;
  private Column<String> col_name = null;
  private Column<String> col_type = null;
  private Column<Integer> col_widget = null;
  private Column<String> col_urlkey = null;

 /**
  * Constructor. 
  * 
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param database          the POEM database we are using
  * @param name              the name of this <code>Table</code>
  * @param definitionSource  which definition is being used
  * @throws PoemException    if anything goes wrong
  */

  public PropertyTableBase(
      Database database, String name,
      DefinitionSource definitionSource) throws PoemException {
    super(database, name, definitionSource);
  }


 /**
  * Get the database tables.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @return the database tables
  */
  public CuratorDatabaseTables getCuratorDatabaseTables() {
    return (CuratorDatabaseTables)getDatabase();
  }

  public void init() throws PoemException {
    super.init();
    defineColumn(col_id =
        new Column<Integer>(this, "id",
                   new TroidPoemType(),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Property)g).getId();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Property)g).setId((Integer)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((Property)g).getIdField();
          }

          protected boolean defaultUserEditable() {
            return false;
          }

          protected boolean defaultUserCreateable() {
            return false;
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Id";
          }

          protected int defaultDisplayOrder() {
            return 100;
          }

          protected boolean defaultIndexed() {
            return true;
          }

          protected boolean defaultUnique() {
            return true;
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getId_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setId_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getId();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setId((Integer)raw);
          }
        });

    defineColumn(col_name =
        new Column<String>(this, "name",
                   new StringPoemType(false, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Property)g).getName();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Property)g).setName((String)cooked);
          }

          public Field<String> asField(Persistent g) {
            return ((Property)g).getNameField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.primary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.primary;
          }

          protected String defaultDisplayName() {
            return "Name";
          }

          protected int defaultDisplayOrder() {
            return 10;
          }

          protected String defaultDescription() {
            return "The identifier for the member";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getName_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setName_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getName();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setName((String)raw);
          }
        });

    defineColumn(col_type =
        new Column<String>(this, "type",
                   new StringPoemType(false, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Property)g).getType();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Property)g).setType((String)cooked);
          }

          public Field<String> asField(Persistent g) {
            return ((Property)g).getTypeField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.yes;
          }

          protected String defaultDisplayName() {
            return "Type";
          }

          protected int defaultDisplayOrder() {
            return 20;
          }

          protected String defaultDescription() {
            return "The class name of the member";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getType_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setType_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getType();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setType((String)raw);
          }
        });

    defineColumn(col_widget =
        new Column<Integer>(this, "widget",
                   new ReferencePoemType(getCuratorDatabaseTables().
                                             getWidgetTable(), false),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Property)g).getWidget();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Property)g).setWidget((Widget)cooked);
          }

          public Field<Integer> asField(Persistent g) {
            return ((Property)g).getWidgetField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.summary;
          }

          protected Searchability defaultSearchability() {
            return Searchability.primary;
          }

          protected String defaultDisplayName() {
            return "Widget";
          }

          protected int defaultDisplayOrder() {
            return 5;
          }

          protected String defaultDescription() {
            return "The widget this property belongs to";
          }

          protected boolean defaultIndexed() {
            return true;
          }

          protected int defaultWidth() {
            return 1;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getWidget_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setWidget_unsafe((Integer)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getWidgetTroid();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setWidgetTroid((Integer)raw);
          }
        });

    defineColumn(col_urlkey =
        new Column<String>(this, "urlkey",
                   new StringPoemType(true, -1),
                   DefinitionSource.dsd) { 
          public Object getCooked(Persistent g)
              throws AccessPoemException, PoemException {
            return ((Property)g).getUrlkey();
          }

          public void setCooked(Persistent g, Object cooked)
              throws AccessPoemException, ValidationPoemException {
            ((Property)g).setUrlkey((String)cooked);
          }

          public Field<String> asField(Persistent g) {
            return ((Property)g).getUrlkeyField();
          }

          protected DisplayLevel defaultDisplayLevel() {
            return DisplayLevel.record;
          }

          protected Searchability defaultSearchability() {
            return Searchability.no;
          }

          protected Integer defaultDisplayOrderPriority() {
            return new Integer(70);
          }

          protected String defaultDisplayName() {
            return "Url Key";
          }

          protected int defaultDisplayOrder() {
            return 70;
          }

          protected String defaultDescription() {
            return "Key for an url";
          }

          protected int defaultWidth() {
            return 20;
          }

          protected int defaultHeight() {
            return 1;
          }

          public Object getRaw_unsafe(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getUrlkey_unsafe();
          }

          public void setRaw_unsafe(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setUrlkey_unsafe((String)raw);
          }

          public Object getRaw(Persistent g)
              throws AccessPoemException {
            return ((Property)g).getUrlkey();
          }

          public void setRaw(Persistent g, Object raw)
              throws AccessPoemException {
            ((Property)g).setUrlkey((String)raw);
          }
        });
  }


 /**
  * Retrieves the <code>Id</code> <code>Column</code> for this 
  * <code>Property</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the id <code>Column</code>
  */
  public final Column<Integer> getIdColumn() {
    return col_id;
  }


 /**
  * Retrieves the <code>Name</code> <code>Column</code> for this 
  * <code>Property</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the name <code>Column</code>
  */
  public final Column<String> getNameColumn() {
    return col_name;
  }


 /**
  * Retrieves the <code>Type</code> <code>Column</code> for this 
  * <code>Property</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the type <code>Column</code>
  */
  public final Column<String> getTypeColumn() {
    return col_type;
  }


 /**
  * Retrieves the <code>Widget</code> <code>Column</code> for this 
  * <code>Property</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the widget <code>Column</code>
  */
  public final Column<Integer> getWidgetColumn() {
    return col_widget;
  }


 /**
  * Retrieves the <code>Urlkey</code> <code>Column</code> for this 
  * <code>Property</code> <code>Table</code>.
  * 
  * see org.melati.poem.prepro.FieldDef#generateColAccessor 
  * @return the urlkey <code>Column</code>
  */
  public final Column<String> getUrlkeyColumn() {
    return col_urlkey;
  }


 /**
  * Retrieve the <code>Property</code> as a <code>Property</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Oject ID
  * @return the <code>Persistent</code> identified by the <code>troid</code>
  */
  public Property getPropertyObject(Integer troid) {
    return (Property)getObject(troid);
  }


 /**
  * Retrieve the <code>Property</code> 
  * as a <code>Property</code>.
  *
  * see org.melati.poem.prepro.TableDef#generateTableBaseJava 
  * @param troid a Table Row Object ID
  * @return the <code>Persistent</code> identified   */
  public Property getPropertyObject(int troid) {
    return (Property)getObject(troid);
  }

  protected JdbcPersistent _newPersistent() {
    return new Property();
  }
  protected String defaultDisplayName() {
    return "Property";
  }

  protected String defaultDescription() {
    return "Observable property";
  }

  protected String defaultCategory() {
    return "Normal";
  }

  protected int defaultDisplayOrder() {
    return 6;
  }
}

