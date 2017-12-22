/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.*;
import java.util.*;
import org.hibernate.*;

/**
 *
 * @author thuandd
 */
public class CategoryModel {
    private final SessionFactory sf = HibernateUtil.getSessionFactory();
    public List<Category> list() {
        try {
            sf.getCurrentSession().beginTransaction();
            List<Category> list = sf.getCurrentSession().createCriteria(Category.class).list();
            return list;
        } catch (Exception e) {
            return null;
        }
    }
    public Category find(Integer id) {
        try {
            sf.getCurrentSession().beginTransaction();
            return (Category) sf.getCurrentSession().get(Category.class, id);
        } catch (Exception e) {
            return null;
        }
    }
    public boolean destroy(Category category){
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().delete(category);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (HibernateException e) {
           
            sf.getCurrentSession().getTransaction().rollback();
        }
        return false;
    }
    public boolean add(Category category) {
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().saveOrUpdate(category);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            sf.getCurrentSession().getTransaction().rollback();
        }
        return false;
    }
    public static void main(String[] args) {
         CategoryModel categoryM = new CategoryModel();
         Integer id = 4;
         Category cat = categoryM.find(id);
         System.out.println(categoryM.destroy(cat));
    }
    
}
