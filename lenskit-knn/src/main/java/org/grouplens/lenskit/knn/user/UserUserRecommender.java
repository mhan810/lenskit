/*
 * LensKit, a reference implementation of recommender algorithms.
 * Copyright 2010-2011 Regents of the University of Minnesota
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package org.grouplens.lenskit.knn.user;

import org.grouplens.lenskit.BasketRecommender;
import org.grouplens.lenskit.DynamicRatingPredictor;
import org.grouplens.lenskit.RatingPredictor;
import org.grouplens.lenskit.RatingRecommender;
import org.grouplens.lenskit.Recommender;

/**
 * UserUserRecommender is a Recommender implementation that uses user-user
 * collaborative filtering to compute predictions and recommendations. They are
 * built using a {@link UserUserRecommenderBuilder}.
 * 
 * @author Michael Ludwig <mludwig@cs.umn.edu>
 */
public class UserUserRecommender implements Recommender {
    private final UserUserRatingPredictor pred;
    private final UserUserRatingRecommender rec;
    
    UserUserRecommender(UserUserRatingPredictor pred, UserUserRatingRecommender rec) {
        this.pred = pred;
        this.rec = rec;
    }
    
    @Override
    public RatingPredictor getRatingPredictor() {
        return pred;
    }
    
    @Override
    public DynamicRatingPredictor getDynamicRatingPredictor() {
        return pred;
    }

    @Override
    public RatingRecommender getRatingRecommender() {
        return rec;
    }

    @Override
    public BasketRecommender getBasketRecommender() {
        // TODO Implement?
        return null;
    }
}