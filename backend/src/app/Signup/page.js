"use client";

import React from "react";
import Link from "next/link";
import Image from "next/image";

const Page = () => {
  return (
    <div className="flex h-screen w-full bg-black">
      {/*  1` Signup Form Section */}
      <div className="w-full lg:w-1/2 h-full flex items-center justify-center bg-black px-8">
        <div className="w-full max-w-md">
          <h2 className="text-center text-2xl font-bold tracking-tight text-yellow-500">
            Create your account
          </h2>

          <form className="mt-6 space-y-6">
            {/* Username */}
            <div>
              <label htmlFor="username" className="block text-sm font-medium text-yellow-500">
                Username
              </label>
              <input
                type="text"
                name="username"
                id="username"
                required
                className="mt-2 block w-full rounded-md bg-gray-400 px-3 py-2 text-gray-900 focus:outline-indigo-600"
              />
            </div>

            {/* Email  */}
            <div>
              <label htmlFor="email" className="block text-sm font-medium text-yellow-500">
                Email address
              </label>
              <input
                type="email"
                name="email"
                id="email"
                autoComplete="email"
                required
                className="mt-2 block w-full rounded-md bg-gray-400 px-3 py-2 text-gray-900 focus:outline-indigo-600"
              />
            </div>

            {/* Password */}
            <div>
              <label htmlFor="password" className="block text-sm font-medium text-yellow-500">
                Password
              </label>
              <input
                type="password"
                name="password"
                id="password"
                required
                className="mt-2 block w-full rounded-md bg-gray-400 px-3 py-2 text-gray-900 focus:outline-indigo-600"
              />
            </div>

            {/* Confirm Password */}
            <div>
              <label htmlFor="confirm-password" className="block text-sm font-medium text-yellow-500">
                Confirm Password
              </label>
              <input
                type="password"
                name="confirm-password"
                id="confirm-password"
                required
                className="mt-2 block w-full rounded-md bg-gray-400 px-3 py-2 text-gray-900 focus:outline-indigo-600"
              />
            </div>

            {/* Signup */}
            <button
              type="submit"
              className="w-full rounded-md bg-yellow-500 px-3 py-2 text-sm font-semibold text-black hover:bg-yellow-400 focus:outline-indigo-600">
              Sign Up
            </button>
          </form>

          {/* Login  */}
          <p className="mt-6 text-center text-sm text-gray-500">
            Already a member?{" "}
            <Link href="/Login" className="font-semibold text-yellow-500 hover:text-yellow-200">
              Log in
            </Link>
          </p>
        </div>
      </div>

      {/* Right Image Section */}
      <div className="w-full lg:w-1/2 h-full flex items-center justify-center">
        <Image
          src="https://images.pexels.com/photos/29721013/pexels-photo-29721013/free-photo-of-modern-architectural-structure-at-twilight.jpeg?auto=compress&cs=tinysrgb&w=600"
          alt="Hotel Image"
          width={800}
          height={600}
          className="h-full w-full object-cover"
          priority
        />
      </div>
    </div>
  );
};

export default Page;
