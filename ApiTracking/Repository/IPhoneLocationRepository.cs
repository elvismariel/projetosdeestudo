using ApiTracking.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ApiTracking.Repository
{
    public interface IPhoneLocationRepository
    {
        void add(PhoneLocation phoneLocation);

        IEnumerable<PhoneLocation> GetAll();

        PhoneLocation Find(long id);

        void Remover(long id);

        void Update(PhoneLocation user);
    }
}
