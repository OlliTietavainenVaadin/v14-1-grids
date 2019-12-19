package org.vaadin.test;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the grids-test template.
 * <p>
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("grids-test")
@JsModule("./grids-test.js")
public class GridsTest extends PolymerTemplate<GridsTest.GridsTestModel> {

    @Id("hyphenless")
    private Grid<String> hyphenless;
    @Id("with-hyphen")
    private Grid<String> withHyphen;

    /**
     * Creates a new GridsTest.
     */
    public GridsTest() {
        hyphenless.addColumn(s -> s).setHeader("Value");
        withHyphen.addColumn(s -> s).setHeader("Value");
        hyphenless.setItems("foo", "bar", "baz");
        withHyphen.setItems("foo", "bar", "baz");
    }

    /**
     * This model binds properties between GridsTest and grids-test
     */
    public interface GridsTestModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
