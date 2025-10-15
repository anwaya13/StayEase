"use client";

import React from "react";
import Link from "next/link";
import Image from "next/image";

const Page = () => {
  return (
    <div className="flex h-screen w-full bg-black">
      {/*  Image  */}
      <div className="w-full lg:w-1/2 h-full flex items-center justify-center">
        <Image
          src="https://images.pexels.com/photos/29721013/pexels-photo-29721013/free-photo-of-modern-architectural-structure-at-twilight.jpeg?auto=compress&cs=tinysrgb&w=600"
          alt="Hotel Image" width={800} height={600}
          className="h-full w-full object-cover" />
      </div>

      {/*  Login Form */}
      <div className="w-full lg:w-1/2 h-full flex items-center justify-center bg-black">
        <div className="w-full max-w-md px-8">
          <h2 className="text-center text-2xl font-bold tracking-tight text-yellow-500">Login to your account</h2>

          <form className="mt-6 space-y-6">
            {/* Email  */}
            <div>
              <label htmlFor="email" className="block text-sm font-medium text-yellow-500">
                Email address</label>
              <input type="email" name="email" id="email"
                autoComplete="email"
                required className="mt-2 block w-full rounded-md bg-gray-400 px-3 py-2 text-gray-900 focus:outline-indigo-600"
              />
            </div>

            {/* Password */}
            <div>
              <label htmlFor="password" className="block text-sm font-medium text-yellow-500"> Password</label>
              <input type="password"
                name="password" id="password"
                autoComplete="current-password"
                required  className="mt-2 block w-full rounded-md bg-gray-400 px-3 py-2 text-gray-900 focus:outline-indigo-600"/>
              <div className="mt-2 text-right">
                <Link href="/forg*ot-password" className="text-sm font-semibold text-yellow-500 hover:text-violet-400">
                  Forgot password?</Link>
              </div>
            </div>

            <button type="submit" className="w-full rounded-md bg-yellow-500 px-3 py-2 text-sm font-semibold text-black hover:bg-violet-400 focus:outline-indigo-600">
              Log In </button>
          </form>

          {/* Signup  */}
          <p className="mt-6 text-center text-sm text-gray-500">
            Not a member?{" "}
            <Link href="/Signup" className="font-semibold text-yellow-500 hover:text-violet-400">Sign up now</Link>
          </p>
        </div>
      </div>
    </div>
  );
};

export default Page;