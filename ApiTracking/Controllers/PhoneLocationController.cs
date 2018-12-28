using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ApiTracking.Models;
using ApiTracking.Repository;
using Microsoft.AspNetCore.Mvc;

namespace ApiTracking.Controllers
{
    [Produces("application/json")]
    [Route("api/[Controller]")]
    public class PhoneLocationController : Controller
    {
        private readonly IPhoneLocationRepository phoneLocationRepository;

        public PhoneLocationController(IPhoneLocationRepository ur)
        {
            phoneLocationRepository = ur;
        }

        [HttpGet]
        public IEnumerable<PhoneLocation> Get()
        {
            return phoneLocationRepository.GetAll();
        }

        [HttpPost]
        public IActionResult Create([FromBody] PhoneLocation phoneLocation)
        {
            if (phoneLocation == null)
                return BadRequest();

            return new NoContentResult();
        }
    }
}