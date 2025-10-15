"use client";

import React from "react";
import Link from "next/link";

const hotels = [
  {
    id: 1,
    name: "Grand Mega Hotel",
    price: "$150/night",
    location: "New York, USA",
    image: "https://images.pexels.com/photos/164595/pexels-photo-164595.jpeg?auto=compress&cs=tinysrgb&w=600",
  },
  {
    id: 2,
    name: "Royal Comfort Suites",
    price: "$120/night",
    location: "Los Angeles, USA",
    image: "https://images.pexels.com/photos/271624/pexels-photo-271624.jpeg?auto=compress&cs=tinysrgb&w=600",
  },
  {
    id: 3,
    name: "Paradise Resort",
    price: "$200/night",
    location: "Miami, USA",
    image: "https://images.pexels.com/photos/189296/pexels-photo-189296.jpeg?auto=compress&cs=tinysrgb&w=600",
  },
  {
    id: 4,
    name: "Skyline Hotel",
    price: "$180/night",
    location: "Chicago, USA",
    image: "https://images.pexels.com/photos/261169/pexels-photo-261169.jpeg?auto=compress&cs=tinysrgb&w=600",
  },
  {
    id: 5,
    name: "Sunset Bay Inn",
    price: "$130/night",
    location: "San Francisco, USA",
    image: "https://images.pexels.com/photos/261102/pexels-photo-261102.jpeg?auto=compress&cs=tinysrgb&w=600",
  },
  {
    id: 6,
    name: "Luxury Stay Hotel",
    price: "$250/night",
    location: "Las Vegas, USA",
    image: "https://images.pexels.com/photos/346885/pexels-photo-346885.jpeg?auto=compress&cs=tinysrgb&w=600",
  },
];

const HotelsPage = () => {
  return (
    <div className="bg-black text-white">
      {/* Navbar */}
      <header className="flex justify-between items-center bg-yellow-500 text-black py-4 px-8">
        <div className="text-2xl font-semibold">
          <Link href="/" className="text-black">StayEase</Link>
        </div>

        <nav className="flex space-x-6">
          <Link href="/HomePage" className="hover:text-gray-800">Home</Link>
          <Link href="/hotels" className="hover:text-gray-800">Hotels</Link>
          <Link href="/bookings" className="hover:text-gray-800">Bookings</Link>
          <Link href="/About" className="hover:text-gray-800">About</Link>
        </nav>

        <div>
          <Link href="/profile" className="bg-black text-yellow-500 px-4 py-2 rounded hover:bg-gray-800">Profile</Link>
        </div>
      </header>

      {/* Hero Section */}
      <section className="relative h-80 flex justify-center items-center">
        <div className="relative w-[90%] h-full overflow-hidden rounded-xl">
          <div className="absolute inset-0 bg-black opacity-50 flex justify-center items-center">
            <h1 className="text-4xl font-bold text-white text-center px-6">
              Explore Our Top-Rated Hotels</h1>
          </div>
          <img src="https://images.pexels.com/photos/189296/pexels-photo-189296.jpeg?auto=compress&cs=tinysrgb&w=600"
            alt="Hotels"className="w-full h-full object-cover"/>
        </div>
      </section>

      {/* Hotels  */}
      <section className="py-16 px-8">
        <h2 className="text-3xl font-semibold text-center text-yellow-500 mb-8"> Discover Your Perfect Stay</h2>

        <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
          {hotels.map((hotel) => (
            <div key={hotel.id} className="bg-gray-900 rounded-lg overflow-hidden shadow-lg hover:scale-105 transition-transform">
              <img src={hotel.image} alt={hotel.name} className="w-full h-48 object-cover" />
              <div className="p-4">
                <h3 className="text-xl font-semibold text-yellow-400">{hotel.name}</h3>
                <p className="text-gray-300">{hotel.location}</p>
                <p className="text-lg font-bold text-yellow-500 mt-2">{hotel.price}</p>
                <button className="mt-4 bg-yellow-500 text-black px-4 py-2 rounded w-full hover:bg-yellow-600">Book Now</button>
              </div>
            </div>
          ))}
        </div>
      </section>
    </div>
  );
};

export default HotelsPage;
