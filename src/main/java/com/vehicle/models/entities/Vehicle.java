package com.vehicle.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_data")
public class Vehicle implements Serializable{

    @Id
    private String nomor_registrasi_kendaraan;

    @Column(nullable=false)
    private String nama_pemilik;

    private String alamat;
    
    private String merk_kendaraan; 

    @Column(length=4)
    private int tahun_pembuatan; 

    private int kapasitas_silinder; 

    private String warna_kendaraan;

    private String bahan_bakar;

    public Vehicle() {
    }

    public Vehicle(String nomor_registrasi_kendaraan, String nama_pemilik, String alamat, String merk_kendaraan,
            int tahun_pembuatan, int kapasitas_silinder, String warna_kendaraan, String bahan_bakar) {
        this.nomor_registrasi_kendaraan = nomor_registrasi_kendaraan;
        this.nama_pemilik = nama_pemilik;
        this.alamat = alamat;
        this.merk_kendaraan = merk_kendaraan;
        this.tahun_pembuatan = tahun_pembuatan;
        this.kapasitas_silinder = kapasitas_silinder;
        this.warna_kendaraan = warna_kendaraan;
        this.bahan_bakar = bahan_bakar;
    }

    public String getNomor_registrasi_kendaraan() {
        return nomor_registrasi_kendaraan;
    }

    public void setNomor_registrasi_kendaraan(String nomor_registrasi_kendaraan) {
        this.nomor_registrasi_kendaraan = nomor_registrasi_kendaraan;
    }

    public String getNama_pemilik() {
        return nama_pemilik;
    }

    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMerk_kendaraan() {
        return merk_kendaraan;
    }

    public void setMerk_kendaraan(String merk_kendaraan) {
        this.merk_kendaraan = merk_kendaraan;
    }

    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }

    public void setTahun_pembuatan(int tahun_pembuatan) {
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public int getKapasitas_silinder() {
        return kapasitas_silinder;
    }

    public void setKapasitas_silinder(int kapasitas_silinder) {
        this.kapasitas_silinder = kapasitas_silinder;
    }

    public String getWarna_kendaraan() {
        return warna_kendaraan;
    }

    public void setWarna_kendaraan(String warna_kendaraan) {
        this.warna_kendaraan = warna_kendaraan;
    }

    public String getBahan_bakar() {
        return bahan_bakar;
    }

    public void setBahan_bakar(String bahan_bakar) {
        this.bahan_bakar = bahan_bakar;
    }

    
}
