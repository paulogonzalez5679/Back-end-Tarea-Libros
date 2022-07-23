/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Tarea;
import java.util.List;

/**
 *
 * @author yonder
 */
public interface TareaService {
    public List<Tarea> findAll();
    public Tarea save(Tarea tarea);
    public Tarea findById(String id);
    public void delete(String id);
    
}
