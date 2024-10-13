-- Inserting dummy data into USERS table
INSERT INTO USERS (uid, name, password, age, gender, wallet, email, mob, cur) VALUES
('550e8400-e29b-41d4-a716-446655440000', 'Rajesh Kumar', 'password123', 29, 'M', 1500.50, 'rajesh.kumar@example.com', '9876543210', 'INR'),
('550e8400-e29b-41d4-a716-446655440001', 'Priya Sharma', 'mypassword', 25, 'F', 3200.00, 'priya.sharma@example.com', '9876543211', 'INR'),
('550e8400-e29b-41d4-a716-446655440002', 'Sanjay Patel', 'helloWorld', 34, 'M', 450.75, 'sanjay.patel@example.com', '9876543212', 'INR'),
('550e8400-e29b-41d4-a716-446655440003', 'Meena Reddy', 'meena2024', 28, 'F', 2200.10, 'meena.reddy@example.com', '9876543213', 'INR'),
('550e8400-e29b-41d4-a716-446655440004', 'Amit Singh', 'password456', 30, 'M', 1100.00, 'amit.singh@example.com', '9876543214', 'INR');

-- Inserting dummy data into the BUDGET_ALLOC table
INSERT INTO BUDGET_ALLOC (uid, year, month, rent, water, electricity, travel, entertainment, medical, debt, food, savings, investment, mob_internet, shopping, income) VALUES
('550e8400-e29b-41d4-a716-446655440000', 2024, 'Jan', 15000.00, 800.00, 1200.00, 3000.00, 2000.00, 1000.00, 1500.00, 6000.00, 2000.00, 2500.00, 500.00, 1500.00, 60000.00),
('550e8400-e29b-41d4-a716-446655440001', 2024, 'Feb', 15500.00, 850.00, 1300.00, 3200.00, 1800.00, 1200.00, 1000.00, 6500.00, 2500.00, 2000.00, 600.00, 2000.00, 62000.00),
('550e8400-e29b-41d4-a716-446655440002', 2024, 'Mar', 16000.00, 900.00, 1400.00, 3500.00, 2500.00, 900.00, 800.00, 7000.00, 3000.00, 1500.00, 700.00, 1800.00, 64000.00),
('550e8400-e29b-41d4-a716-446655440003', 2024, 'Apr', 16200.00, 950.00, 1450.00, 4000.00, 2200.00, 1300.00, 500.00, 6800.00, 2000.00, 1200.00, 400.00, 2200.00, 63000.00),
('550e8400-e29b-41d4-a716-446655440004', 2024, 'May', 15800.00, 920.00, 1300.00, 3700.00, 2100.00, 1100.00, 700.00, 6200.00, 2800.00, 2500.00, 550.00, 1900.00, 60000.00);

-- Inserting dummy data into the Expense table
INSERT INTO Expense (uid, date, dineout, vegetable, dairy, fruits, meat, travel, personal, entertainment, cloths, furniture, electronics, grooming, other) VALUES
('550e8400-e29b-41d4-a716-446655440000', '2024-01-10', 1500.00, 300.00, 200.00, 250.00, 600.00, 800.00, 400.00, 600.00, 700.00, 500.00, 1200.00, 300.00, 100.00),
('550e8400-e29b-41d4-a716-446655440001', '2024-02-15', 1200.00, 350.00, 180.00, 200.00, 700.00, 1000.00, 300.00, 800.00, 600.00, 800.00, 1500.00, 250.00, 200.00),
('550e8400-e29b-41d4-a716-446655440002', '2024-03-20', 1700.00, 250.00, 220.00, 300.00, 800.00, 600.00, 500.00, 400.00, 300.00, 700.00, 900.00, 150.00, 150.00),
('550e8400-e29b-41d4-a716-446655440003', '2024-04-05', 1400.00, 320.00, 210.00, 270.00, 500.00, 900.00, 350.00, 500.00, 800.00, 600.00, 1100.00, 200.00, 50.00),
('550e8400-e29b-41d4-a716-446655440004', '2024-05-12', 1600.00, 280.00, 190.00, 300.00, 750.00, 700.00, 600.00, 900.00, 400.00, 300.00, 800.00, 100.00, 300.00);


-- Inserting dummy data into the Expenses_desc table
INSERT INTO Expenses_desc (uid, date, dineout_desc, vegetable_desc, dairy_desc, fruits_desc, meat_desc, travel_desc, personal_desc, entertainment_desc, cloths_desc, furniture_desc, electronics_desc, grooming_desc, other_desc) VALUES
('550e8400-e29b-41d4-a716-446655440000', '2024-01-10', 'Dinner at Italian Restaurant', 'Fresh spinach, carrots, and bell peppers', 'Organic milk and cheese', 'Bananas and apples', 'Chicken breast for stir fry', 'Taxi to downtown', 'New shoes purchase', 'Movie tickets for weekend', 'Winter coat', 'New dining table', 'Smartphone upgrade', 'Haircut at local salon', 'Gym membership fee'),
('550e8400-e29b-41d4-a716-446655440001', '2024-02-15', 'Lunch at local cafe', 'Potatoes and tomatoes', 'Butter and yogurt', 'Seasonal fruits', 'Pork chops for grilling', 'Train fare for business trip', 'Books and stationery', 'Concert tickets', 'Formal shirt', 'Bookshelf for study', 'Laptop accessories', 'Facial treatment', 'Gifts for friends'),
('550e8400-e29b-41d4-a716-446655440002', '2024-03-20', 'Brunch with friends', 'Mixed salad greens', 'Cheese for breakfast', 'Oranges and grapes', 'Ground beef for tacos', 'Car rental for weekend', 'Personal care products', 'Board games for family night', 'Jeans and sneakers', 'Desk lamp for work', 'Gaming console', 'Nail salon visit', 'Charity donation'),
('550e8400-e29b-41d4-a716-446655440003', '2024-04-05', 'Takeout from Chinese restaurant', 'Cabbage and onions', 'Milk for coffee', 'Strawberries and kiwis', 'Fish for grilling', 'Bus fare for weekend trip', 'Cosmetics purchase', 'Spa day', 'Casual wear', 'Sofa for living room', 'Headphones', 'Hair color treatment', 'House cleaning supplies'),
('550e8400-e29b-41d4-a716-446655440004', '2024-05-12', 'Dinner at a seafood place', 'Seasonal veggies', 'Yogurt for breakfast', 'Apples and berries', 'Lamb chops for grilling', 'Flight tickets for vacation', 'Self-care items', 'Theme park tickets', 'Summer dresses', 'Patio furniture', 'Smartwatch', 'Massage therapy', 'Miscellaneous items');

-- Inserting dummy data into the Fixed_Charges table
INSERT INTO Fixed_Charges (uid, date, rent, water, electricity, internet, investment, savings, debt, gas) VALUES
('550e8400-e29b-41d4-a716-446655440000', '2024-01-01', 15000.00, 800.00, 1200.00, 1000.00, 5000.00, 2000.00, 1500.00, 600.00),
('550e8400-e29b-41d4-a716-446655440001', '2024-02-01', 15500.00, 850.00, 1300.00, 1100.00, 5200.00, 2100.00, 1600.00, 700.00),
('550e8400-e29b-41d4-a716-446655440002', '2024-03-01', 16000.00, 900.00, 1400.00, 950.00, 5300.00, 2200.00, 1700.00, 650.00),
('550e8400-e29b-41d4-a716-446655440003', '2024-04-01', 16200.00, 950.00, 1450.00, 1050.00, 5400.00, 2300.00, 1800.00, 700.00),
('550e8400-e29b-41d4-a716-446655440004', '2024-05-01', 15800.00, 920.00, 1500.00, 980.00, 5500.00, 2400.00, 1900.00, 720.00);

-- Inserting dummy data into the Investment table
INSERT INTO Investment (uid, date, name, category, description) VALUES
('550e8400-e29b-41d4-a716-446655440000', '2024-01-15', 'Dream House Purchase', 'Real Estate', 'Invested in a 2BHK apartment in the city center.'),
('550e8400-e29b-41d4-a716-446655440001', '2024-02-20', 'Gold Jewelry', 'Gold', 'Purchased gold jewelry for personal use and investment.'),
('550e8400-e29b-41d4-a716-446655440002', '2024-03-10', 'Digital Gold Investment', 'Digital Gold', 'Invested in digital gold through an online platform.'),
('550e8400-e29b-41d4-a716-446655440003', '2024-04-25', 'Bitcoin Purchase', 'Cryptocurrency', 'Bought Bitcoin as part of a diversified investment portfolio.'),
('550e8400-e29b-41d4-a716-446655440004', '2024-05-30', 'Government Bonds', 'Bonds', 'Invested in government bonds for stable returns.'),
('550e8400-e29b-41d4-a716-446655440000', '2024-06-15', 'Tech Stocks', 'Stocks', 'Purchased shares of leading tech companies.'),
('550e8400-e29b-41d4-a716-446655440001', '2024-07-20', 'Mutual Funds', 'Funds', 'Invested in mutual funds for long-term wealth accumulation.');

