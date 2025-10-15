"use client";

import React from "react";
import Link from "next/link";

const AboutUsPage = () => {
  return (
    <div className="bg-black text-white">
      {/* Navbar */}
      <header className="flex justify-between items-center bg-yellow-500 text-black py-4 px-8">
        {/* Hotel Name */}
        <div className="text-2xl font-semibold">
          <Link href="/" className="text-black">StayEase</Link>
        </div>

        {/* Navigation Links */}
        <nav className="flex space-x-6">
          <Link href="/HomePage" className="hover:text-gray-800">Home</Link>
          <Link href="/hotels" className="hover:text-gray-800">Hotels</Link>
          <Link href="/bookings" className="hover:text-gray-800">Bookings</Link>
          <Link href="/About" className="hover:text-gray-800">About</Link>
        </nav>

        {/* Sign-Up Button */}  
        <div>
          <Link href="/profile" className="bg-black text-yellow-500 px-4 py-2 rounded hover:bg-gray-800">profile </Link>
        </div>
      </header>

      {/* Hero Section */}
      <section className="relative h-80 flex justify-center items-center">
        <div className="relative w-[90%] h-full overflow-hidden rounded-xl">
          <div className="absolute inset-0 bg-black opacity-50 flex justify-center items-center">
            <h1 className="text-4xl font-bold text-white text-center px-6">
              About StayEase - Your Perfect Stay Experience
            </h1>
          </div>
          <img
            src="https://images.pexels.com/photos/261169/pexels-photo-261169.jpeg?auto=compress&cs=tinysrgb&w=600"
            alt="About StayEase" className="w-full h-full object-cover"/>
        </div>
      </section>

      {/* Content */}
      <section className="py-16 px-8">
        <div className="max-w-4xl mx-auto text-center">
          <h2 className="text-3xl font-semibold text-yellow-500 mb-6">Who We Are</h2>
          <p className="text-lg leading-relaxed text-gray-300">
            At StayEase, we provide the most comfortable, luxurious, and affordable
            hotel booking experience. Whether you’re planning a vacation, a business trip,
            or a weekend getaway, our platform helps you find the perfect stay effortlessly.
          </p>
        </div>
      </section>

      {/* Our Mission */}
      <section className="py-16 px-8 bg-gray-900">
        <div className="max-w-4xl mx-auto text-center">
          <h2 className="text-3xl font-semibold text-yellow-500 mb-6">Our Mission</h2>
          <p className="text-lg leading-relaxed text-gray-300">
            Our mission is to provide a seamless hotel booking experience by offering a
            wide range of accommodations with the best deals. We strive to ensure our
            customers enjoy hassle-free, safe, and comfortable stays at top-rated hotels.
          </p>
        </div>
      </section>

      {/* Our Services */}
      <section className="py-16 px-8">
        <div className="max-w-4xl mx-auto text-center">
          <h2 className="text-3xl font-semibold text-yellow-500 mb-6">Our Services</h2>
          <ul className="text-lg leading-relaxed text-gray-300 list-disc list-inside">
            <li>Hassle-free online hotel bookings</li>
            <li>Exclusive discounts and offers</li>
            <li>Secure payment options</li>
            <li>24/7 customer support</li>
            <li>Personalized recommendations</li>
          </ul>
        </div>
      </section>

      {/* Contact  */}
      <section className="py-16 px-8 bg-gray-900">
        <div className="max-w-4xl mx-auto text-center">
          <h2 className="text-3xl font-semibold text-yellow-500 mb-6">Contact Us</h2>
          <p className="text-lg text-gray-300">Have questions or need assistance? Reach out to us!</p>
          <p className="mt-4 text-lg text-gray-300"><strong>Email:</strong> support@stayease.com</p>
          <p className="text-lg text-gray-300"><strong>Phone:</strong> +1 234 567 890</p>
          <p className="text-lg text-gray-300"><strong>Address:</strong> 123 StayEase Street, New York, NY</p>
        </div>
      </section>
    </div>
  );
};

export default AboutUsPage;
