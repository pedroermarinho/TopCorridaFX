#!/bin/bash

java --module-path=$PATH_TO_FX --add-modules=javafx.controls,javafx.fxml,sqlite.jdbc -classpath ".:$SNAP/sqlite-jdbc-3.21.0.1.jar" -cp $SNAP/jar/TopCorridaFX-0.1.0.jar br.com.topcorridafx.MainApp