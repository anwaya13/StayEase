'use client'; // Ensure this is a client component

import React from 'react';
import Link from 'next/link';
import Image from 'next/image';

const EntryPage = () => {
    return (
        <div className="relative flex h-screen flex-col items-center justify-center bg-black px-6 py-12 lg:px-8">
            {/* Background Image Grid */}
            <div className="absolute inset-0 grid grid-cols-3 gap-2 opacity-70">
                <div className="relative w-full h-full">
                    <Image
                        src="https://images.pexels.com/photos/258154/pexels-photo-258154.jpeg?auto=compress&cs=tinysrgb&w=600"
                        alt="Hotel Lobby"
                        fill
                        className="object-cover"
                    />
                </div>
                <div className="relative w-full h-full">
                    <Image
                        src="https://images.pexels.com/photos/271619/pexels-photo-271619.jpeg?auto=compress&cs=tinysrgb&w=600"
                        alt="Luxury Room"
                        fill
                        className="object-cover"
                    />
                </div>
                <div className="relative w-full h-full">
                    <Image src="https://images.pexels.com/photos/15551933/pexels-photo-15551933/free-photo-of-luxury-illuminated-restaurant.jpeg?auto=compress&cs=tinysrgb&w=600"
                    alt="Resort View"
                    fill className="object-cover"/>
                </div>

            </div>
            <div className="absolute inset-0 bg-black bg-opacity-60"></div>

    
            <div className="relative z-10 flex flex-col items-center text-center">
                <h3 className="text-3xl font-bold text-yellow-300 drop-shadow-lg md:text-5xl">
                    Welcome to StayEase
                </h3>
                <p className="mt-4 text-lg text-gray-300">Book your perfect stay effortlessly</p>

                <div className="mt-8 flex flex-col gap-4 md:flex-row">
                    <Link href="/Signup">
                        <button className="rounded-lg bg-yellow-500 px-6 py-3 text-lg font-semibold text-black shadow-md hover:bg-violet-400">
                            Sign Up
                        </button>
                    </Link>

                    <Link href="/Login">
                        <button className="rounded-lg bg-yellow-500 px-6 py-3 text-lg font-semibold text-black shadow-md hover:bg-violet-400">Login
                        </button>
                    </Link>
                </div>

                <p className="mt-6 text-sm text-gray-400">
                    <Link href="/HomePage" className="text-gray-400 hover:text-blue-400"> Continue as Guest</Link>
                </p>

            </div>
        </div>
    );
};

export default EntryPage;
