import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';

class GridsTest extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <p>First grid, without hyphen in id:</p>
 <vaadin-grid id="hyphenless"></vaadin-grid>
 <p>Second grid, with a hyphen in id:</p>
 <vaadin-grid id="with-hyphen"></vaadin-grid>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'grids-test';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(GridsTest.is, GridsTest);
