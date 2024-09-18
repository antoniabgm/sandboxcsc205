package sandbox.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {

    // encapsulation example - dont want to allow anything outside of this class to access
    private List<Widget> widgets = new ArrayList<>();

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void addWidget(Widget widget) {
        widgets.add(widget);
    }
}

// curly braces in java define scope (ie falling out of scope)