/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cashdash.services;

import org.cashdash.database.Database;
import org.cashdash.models.Equipment;

/**
 *
 * @author User
 */
public class EquipmentService {
    public static int delete(Equipment e) throws Exception {
        return Database.executeUpdate("DELETE FROM equipments WHERE id = ?",
            e.getId()
        );
    }
    
    public static int deleteById(int id){
        return Database.executeUpdate("DELETE FROM equipments WHERE id = ?",id);
    }
}
