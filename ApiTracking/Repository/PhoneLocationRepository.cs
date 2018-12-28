using System;
using System.Collections.Generic;
using System.Linq;
using ApiTracking.Models;

namespace ApiTracking.Repository
{
    public class PhoneLocationRepository : IPhoneLocationRepository
    {
        private readonly PhoneLocationDbContext ctx;

        public PhoneLocationRepository(PhoneLocationDbContext context)
        {
            ctx = context;
        }

        public void add(PhoneLocation phoneLocation)
        {
            ctx.PhoneLocation.Add(phoneLocation);
            ctx.SaveChanges();
        }

        public PhoneLocation Find(long id)
        {
            return ctx.PhoneLocation.FirstOrDefault(u => u.Id == id);
        }

        public IEnumerable<PhoneLocation> GetAll()
        {
            return ctx.PhoneLocation.ToList();
        }

        public void Remover(long id)
        {
            var entity = ctx.PhoneLocation.First(u => u.Id == id);
            ctx.PhoneLocation.Remove(entity);
            ctx.SaveChanges();
        }

        public void Update(PhoneLocation phoneLocation)
        {
            ctx.PhoneLocation.Update(phoneLocation);
            ctx.SaveChanges();
        }
    }
}
