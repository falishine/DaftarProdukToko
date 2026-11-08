package kelas.controller;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import kelas.Navigator;
import kelas.data.DataProduk;
import kelas.model.Produk;

public class FormController {

    @FXML private TextField namaField;
    @FXML private ComboBox<String> kategoriBox;
    @FXML private TextField hargaField;
    @FXML private Label pesanLabel;

    private Navigator navigator;
    private DataProduk data;

    @FXML
    private void initialize() {
        kategoriBox.getItems().addAll("Makanan", "Minuman");
        kategoriBox.setValue("Makanan");
    }

    public void setKonteks(Navigator navigator, DataProduk data) {
        this.navigator = navigator;
        this.data = data;
    }

    @FXML
    private void simpan() {
        double harga;
        try {
            String teksHarga = hargaField.getText().trim().replace(".", "").replace(",", ".");
            harga = Double.parseDouble(teksHarga);
        } catch (NumberFormatException e) {
            pesanLabel.setText("Harga harus berupa angka yang valid.");
            return;
        }

        try {
            Produk produk = data.tambah(namaField.getText(), kategoriBox.getValue(), harga);
            navigator.bukaDetail(produk);
        } catch (IllegalArgumentException e) {
            pesanLabel.setText(e.getMessage());
        } catch (IOException e) {
            pesanLabel.setText("Halaman detail gagal dibuka.");
            e.printStackTrace();
        }
    }

    @FXML
    private void bukaDaftar() {
        try {
            navigator.bukaDaftar();
        } catch (IOException e) {
            pesanLabel.setText("Gagal membuka daftar produk.");
            e.printStackTrace();
        }
    }
}
