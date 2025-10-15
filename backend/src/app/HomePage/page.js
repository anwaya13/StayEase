"use client";

import React from "react";
import Link from "next/link";
import Image from "next/image";
import { FaArrowLeft, FaArrowRight } from "react-icons/fa";

const HomePage = () => {
  return (
    <div className="bg-black text-white">
      {/* Navbar */}
      <header className="flex justify-between items-center bg-yellow-500 text-black py-4 px-8">
        <div className="text-2xl font-semibold">
          <Link href="/" className="text-black">StayEase</Link>
        </div>
        <nav className="flex space-x-6">
          <Link href="/HomePage" className="hover:text-gray-800">Home</Link>
          <Link href="/hotels" className="hover:text-gray-700">Hotels</Link>
          <Link href="/bookings" className="hover:text-gray-700">Bookings</Link>
          <Link href="/About" className="hover:text-gray-700">About</Link>
        </nav>
        <div>
          <Link href="/Profile" className="bg-black text-yellow-500 px-4 py-2 rounded hover:bg-gray-800">Profile</Link>
        </div>
      </header>

      {/* Hero Section */}
      <section className="relative h-96 flex items-center justify-center text-center bg-cover bg-center rounded-3xl mx-8 mt-6"
        style={{ backgroundImage: "url('https://images.pexels.com/photos/1004530/pexels-photo-1004530.jpeg?auto=compress&cs=tinysrgb&w=600')" }}>
        <div className="absolute inset-0 bg-black opacity-50 rounded-3xl"></div>
        <div className="relative z-10">
          <h1 className="-4xl font-bold">Secure Your Dream Vacation with a Reservation</h1>
          <div className="mt-6 flex items-center justify-center bg-white text-black p-3 rounded-md space-x-3">
            <input type="text" placeholder="Location" className="p-2 rounded bg-gray-100" />
            <input type="date" className="p-2 rounded bg-gray-100" />
            <input type="number" placeholder="Guests" className="p-2 rounded bg-gray-100" />
            <button className="bg-yellow-500 text-black px-4 py-2 rounded">Search</button>
          </div>
          <div className="mt-6 flex justify-center space-x-8">
            <div className="text-xl"><strong>121+</strong> Capital Raised</div>
            <div className="text-xl"><strong>80+</strong> Happy Customers</div>
            <div className="text-xl"><strong>1K+</strong> Property Options</div>
          </div>
        </div>
      </section>

      {/* Featured Hotels */}
      <section className="py-16 px-8">
        <h2 className="text-3xl font-semibold text-center mb-8 text-yellow-500">Our Top-rated and Highly Visited Hotels</h2>
        <div className="relative overflow-hidden">
          <div className="flex space-x-6 overflow-x-auto scrollbar-hide pb-4">
            {[ 
              { name: "Grand Mega Hotel", img: "https://images.pexels.com/photos/1457848/pexels-photo-1457848.jpeg" },
              { name: "Ocean Breeze Resort", img: "https://images.pexels.com/photos/164595/pexels-photo-164595.jpeg" },
              { name: "Mountain View Hotel", img: "https://images.pexels.com/photos/271618/pexels-photo-271618.jpeg" },
              { name: "Luxury Palace", img: "https://images.pexels.com/photos/258154/pexels-photo-258154.jpeg" }
            ].map((hotel, index) => (
              <div key={index} className="w-80 h-60 flex-none bg-cover bg-center rounded-lg relative"
                style={{ backgroundImage: `url(${hotel.img})` }}>
                <div className="absolute inset-0 bg-black bg-opacity-50 flex items-center justify-center">
                  <p className="text-white text-xl">{hotel.name}</p>
                </div>
              </div>
            ))} 
          </div>
        </div>
      </section>
    </div>
  );
};

export default HomePage;
