/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Dao.TareaDao;
import Model.Tarea;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yonder
 */
@Service
public class TareaServiceImplement  implements TareaService{
    @Autowired
    private TareaDao tareaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Tarea> findAll()
    {
        return (List<Tarea>) tareaDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Tarea save(Tarea tarea)
    {
        return tareaDao.save(tarea);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Tarea findById(String id)
    {
        return tareaDao.findById(id).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(String id)
    {
        tareaDao.deleteById(id);
    }
    
}
