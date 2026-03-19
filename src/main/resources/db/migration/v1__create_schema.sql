CREATE TABLE IF NOT EXISTS performances (
    id BIGSERIAL PRIMARY KEY,
    date DATE NOT NULL,
    project VARCHAR(255) NOT NULL,
    venue VARCHAR(255) NOT NULL,
    notes TEXT
);

-- indexes for common queries
CREATE INDEX IF NOT EXISTS idx_performance_date ON performances(date);
