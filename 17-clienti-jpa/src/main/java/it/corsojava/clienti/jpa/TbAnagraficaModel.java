/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.clienti.jpa;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ospite
 */
public class TbAnagraficaModel extends AbstractTableModel {

    private final List<Anagrafica> clienti;

    public TbAnagraficaModel() {
        clienti = AnagraficaStore.all();
    }

    @Override
    public int getRowCount() {
        return clienti.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        Anagrafica cliente = clienti.get(rowIndex);
        switch (colIndex) {
            case 0:
                return cliente.getId();
            case 1:
                return cliente.getCognome();
            case 2:
                return cliente.getNome();
            case 3:
                return cliente.getdNascita();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int colIndex) {
        switch (colIndex) {
            case 0:
                return "ID";
            case 1:
                return "COGNOME";
            case 2:
                return "NOME";
            case 3:
                return "DATA DI NASCITA";
            default:
                throw new AssertionError();
        }
    }
    
    

}
