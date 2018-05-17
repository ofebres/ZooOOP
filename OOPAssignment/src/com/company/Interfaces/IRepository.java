package com.company.Interfaces;

import java.util.List;

public interface IRepository<T> {

   List<T> Read();
   void Write();
   void Update();
   void Delete();
}
