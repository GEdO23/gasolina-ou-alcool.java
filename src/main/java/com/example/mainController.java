package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class mainController {

    @FXML
    TextField txtGasolina;

    @FXML
    TextField txtAlcool;

    @FXML
    Label txtFinal;
    
    @FXML
    private void comparar() throws IOException {
        double menorPreco;
        double gasolina = Double.valueOf(txtGasolina.getText());
        double alcool = Double.valueOf(txtAlcool.getText()); 
        if (alcool < gasolina) {
            menorPreco = alcool;
        } else {
            menorPreco = gasolina;
        }
    
        txtFinal.setText("O menor preco é R$" + menorPreco);
    }

    @FXML
    private void proximo() throws IOException {
        App.setRoot("secondary");
    }
}
