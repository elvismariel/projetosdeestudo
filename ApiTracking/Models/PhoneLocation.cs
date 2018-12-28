using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ApiTracking.Models
{
    public class PhoneLocation
    {
        public int Id { get; set; }
        public String phone { get; set; }
        public double latitude { get; set; }
        public double longitude { get; set; }
        public DateTime registry { get; set; }
    }
}
